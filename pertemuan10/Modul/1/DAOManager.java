/**
 * File : DAOManager.java
Nama: Hadyan Kholish Prasetio
NIM: 24060123140197
 * Deskripsi : pengelola DAO dalam program
 */
public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }
    
    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
