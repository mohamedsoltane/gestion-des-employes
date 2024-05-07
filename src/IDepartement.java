public interface IDepartement {
    void ajouterDepartement(Departement departement);
    boolean rechercherDepartement(int id);
    boolean rechercherDepartement(Departement departement);
    void supprimerDepartement(Departement departement);
    void displayDepartements();
}