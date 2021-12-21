package logica;

import java.util.List;
import persistencia.PersistenceController;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author FEDEX
 */
public class Controller {

    PersistenceController persistenceControl = new PersistenceController();

    public void createEmployee(String fname, String lname, String address,
            String identification, String birthday, String nationality,
            String phone, String email, String charge, Double salary,
            String userName, String password) {

        Employee employee = new Employee();
        User user = new User();

        //asigno valores a employee
        employee.setfName(fname);
        employee.setlName(lname);
        employee.setAddress(address);
        employee.setDni(identification);
        employee.setBornDate(birthday);
        employee.setNationality(nationality);
        employee.setPhoneNumber(phone);
        employee.setEmail(email);
        employee.setCharge(charge);
        employee.setSalary(salary);

        //asigno valores a user
        user.setUserName(userName);
        user.setPassword(password);

        //asigno user a employee
        employee.setUser(user);

        persistenceControl.createEmployee(employee, user);

    }

    public void createClient(String fname, String lname, String address,
            String identification, String birthday,
            String nationality, String phone, String email) {

        Client client = new Client();

        //asigno valores a client
        client.setfName(fname);
        client.setlName(lname);
        client.setAddress(address);
        client.setDni(identification);
        client.setBornDate(birthday);
        client.setNationality(nationality);
        client.setPhoneNumber(phone);
        client.setEmail(email);

        persistenceControl.createClient(client);

    }

    public void createSale(String payMethod, String saleDate) {

        Sale sale = new Sale();

        //asigno valores a sale
        sale.setPayMethod(payMethod);
        sale.setSaleDate(saleDate);

        persistenceControl.createSale(sale);
    }

    public void createTouristService(String name, String briefDescription,
            String serviceDestiny, Double serviceCost, String serviceDate) {

        TouristService touristService = new TouristService();

        //asigno valores a client
        touristService.setName(name);
        touristService.setBriefDescription(briefDescription);
        touristService.setServiceDestiny(serviceDestiny);
        touristService.setServiceCost(serviceCost);
        touristService.setServiceDate(serviceDate);

        persistenceControl.createTouristService(touristService);

    }

    public void createTouristPackage(Double packageCost) {

        TouristPackage touristPackage = new TouristPackage();

        //asigno valores a client
        touristPackage.setPackageCost(packageCost);

        persistenceControl.createTouristPackage(touristPackage);

    }

    public void deleteEmployee(int id) {
        persistenceControl.deleteEmployee(id);
    }

    public void deleteClient(int id) {
        persistenceControl.deleteClient(id);
    }

    public void deleteSale(int id) {
        persistenceControl.deleteSale(id);
    }

    public void deleteTouristService(int id) {
        persistenceControl.deleteTouristService(id);
    }

    public void deleteTouristPackage(int id) {
        persistenceControl.deleteTouristPackage(id);
    }

    public List<Employee> getEmployees() {
        return persistenceControl.getEmployees();
    }

    public List<Client> getClients() {
        return persistenceControl.getClients();
    }

    public List<Sale> getSales() {
        return persistenceControl.getSales();
    }

    public List<TouristService> getTourServices() {
        return persistenceControl.getTourServices();
    }

    public List<TouristPackage> getTourPackages() {
        return persistenceControl.getTourPackages();
    }

    public void editEmployee(Employee emp) {
        persistenceControl.editEmployee(emp);
    }

    public void editClient(Client cli) {
        persistenceControl.editCient(cli);
    }

    public void editSale(Sale sale) {
        persistenceControl.editSale(sale);
    }

    public void editTouristService(TouristService tS) {
        persistenceControl.editTouristService(tS);
    }

    public void editTouristPackage(TouristPackage tP) {
        persistenceControl.editTouristPackage(tP);
    }

    public Employee searchEmployee(int id) {
        return persistenceControl.searchEmployee(id);
    }

    public Client searchClient(int id) {
        return persistenceControl.searchClient(id);
    }

    public Sale searchSale(int id) {
        return persistenceControl.searchSale(id);
    }

    public TouristService searchTouristService(int id) {
        return persistenceControl.searchTouristService(id);
    }

    public TouristPackage searchTouristPackage(int id) {
        return persistenceControl.searchTouristPackage(id);
    }

    public boolean checkUser(String user, String pass) {
        List<User> usersList = persistenceControl.getUsers();

        if (usersList != null) {
            for (User us : usersList) {
                if (us.getUserName().equals(user) && us.getPassword().equals(pass)) {
                    return true;
                }
            }
        }
        return false;

    }

}
