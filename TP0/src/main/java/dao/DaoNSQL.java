package dao;

public class DaoNSQL implements IDao{
    @Override
    public double getData() {
        System.out.println("From No sql DB");
        return (10);
    }
}
