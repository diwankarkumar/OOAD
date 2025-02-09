package Java17.Inheritance.Challenge;

public class SalariedEmployee extends Employee {

      private double annualSalary ;
      private boolean isRetired ;

    public SalariedEmployee(String name, String birthDate,
                            String hireDate, double annualSalary,
                            boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {

        double paycheck = annualSalary /26 ;
        double adjustedPay = (isRetired) ? 0.9 *paycheck :paycheck ;
        return (int) adjustedPay ;
    }

    public void retire(){
         terminate("1/1/2025");
         this.isRetired = true ;
      }
}
