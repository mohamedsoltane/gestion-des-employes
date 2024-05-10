import java.util.HashMap;
import java.util.TreeMap;
public class AffectationHashMap {
    private HashMap<Employee, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    public void affecterEmploye(Employee employee, Departement departement) {
        affectations.put(employee, departement);
    }

    public Departement getDepartement(Employee employee) {
        return affectations.get(employee);
    }

    public void supprimerAffectation(Employee employee) {
        affectations.remove(employee);
    }

    public void displayAffectations() {
        for (Employee employee : affectations.keySet()) {
            Departement departement = affectations.get(employee);
            System.out.println("Employé : " + employee.getFirstName() + " " + employee.getLastName() +
                    " Département : " + departement.getDepartmentName());
        }
    }

    public void ajouterEmployeDepartement(Employee employee, Departement departement) {
        if (affectations.containsKey(employee)) {
            Departement ancienDepartement = affectations.get(employee);
            ancienDepartement.setNumberOfEmployees(ancienDepartement.getNumberOfEmployees() - 1);
            }
            affectations.put(employee, departement);
            departement.setNumberOfEmployees(departement.getNumberOfEmployees() + 1);
            }

    public void afficherEmployesEtDepartements() {
        for (Employee employee : affectations.keySet()) {
            Departement departement = affectations.get(employee);
            System.out.println("Employé : " + employee.getFirstName() + " " + employee.getLastName() +
                    ", Département : " + departement.getDepartmentName());
        }
    }



    public void supprimerEmploye(Employee employee) {
        affectations.remove(employee);
        for (Departement department : affectations.values()) {
            if (department.equals(getDepartement(employee))) {
                department.setNumberOfEmployees(department.getNumberOfEmployees() - 1);
                break;
            }
        }
    }

    public void supprimerEmployeEtDepartement(Employee employee, Departement department) {
        if (affectations.containsKey(employee) && affectations.get(employee).equals(department)) {
            affectations.remove(employee);
            department.setNumberOfEmployees(department.getNumberOfEmployees() - 1);
        }
    }

    public void afficherEmployes() {
        for (Employee employee : affectations.keySet()) {
            System.out.println(employee);
        }
    }

    public void afficherDepartements() {
        for (Departement department : affectations.values()) {
            System.out.println(department);
        }
    }

    public boolean rechercherEmploye(Employee employee) {
        return affectations.containsKey(employee);
    }

    public boolean rechercherDepartement(Departement department) {
        return affectations.containsValue(department);
    }
    public TreeMap<Employee, Departement> trierMap() {
        TreeMap<Employee, Departement> sortedMap = new TreeMap<>(new EmployeeIdComparator());
        sortedMap.putAll(affectations);
        return sortedMap;
    }

    private class EmployeeIdComparator implements java.util.Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Integer.compare(e1.getId(), e2.getId());
        }
    }




}
