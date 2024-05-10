import java.util.HashSet;
public class DepartementHashSet implements IDepartement {
    private HashSet<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(int id) {
        for (Departement dept : departements) {
            if (dept.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void displayDepartements() {
        for (Departement dept : departements) {
            System.out.println(dept);
        }
    }
}