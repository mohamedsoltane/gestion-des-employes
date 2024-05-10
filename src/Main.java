public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectations = new AffectationHashMap();

        Employee employee1 = new Employee(1, "Mohamed", "Soltan", "Development", 1);
        Employee employee2 = new Employee(2, "Ghassen", "Mallak", "Marketing", 2);
        Departement department1 = new Departement(1, "Development", 0);
        Departement department2 = new Departement(2, "Marketing", 0);

        affectations.ajouterEmployeDepartement(employee1, department1);
        affectations.ajouterEmployeDepartement(employee2, department2);

        System.out.println("Liste des employés et des départements :");
        affectations.afficherEmployesEtDepartements();

        Departement department3 = new Departement(3, "HR", 0);
        affectations.ajouterEmployeDepartement(employee1, department3);

        System.out.println("\nAprès avoir ajouté le même employé à un autre département :");
        affectations.afficherEmployesEtDepartements();








    }
}