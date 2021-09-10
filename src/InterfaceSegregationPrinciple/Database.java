package InterfaceSegregationPrinciple;

/*
//doesn't follow the principle

public interface Database {
    void createTable();
    void readTable();
    void updateTable();
    void deleteTable();
    void deleteDatabase();
}
 */

//follows principle
public interface Database {
    void deleteDatabase();
}