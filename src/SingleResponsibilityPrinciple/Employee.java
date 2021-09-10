package SingleResponsibilityPrinciple;

//follows principle
public class Employee {
    private Employee(){}
}


/*
//doesn't follow the principle

public class Employee {

    private Employee(){}

    private void addToProject() {}
    private void calculatePay() {}
    private void printDetails() {}

}
 */


