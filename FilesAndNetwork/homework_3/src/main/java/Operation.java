public class Operation {
    private  String infomacion;
    private double income;
    private double expense;
    private boolean isIncome;
    public Operation(String infomacion,double expense, double income,boolean isIncome){
        this.infomacion = infomacion;
        this.expense = expense;
        this.income = income;
        this.isIncome = isIncome;
    }
    public String getInfomacion(){
        return infomacion;

    }
    public double getIncome(){
        return income;
    }
    public double getExpense(){
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setInfomacion(String infomacion) {
        this.infomacion = infomacion;
    }
    public void setIsIncome(boolean isIncome){
        this.isIncome = isIncome;
    }
    public boolean getIsIncome(){
        return isIncome;
    }
}
