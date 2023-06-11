




    public class ExpenseController {
        public void addExpense(Expense expense) {
            ExpenseService expenseService = new ExpenseService();
            expenseService.addExpense(expense);
        }
    }
}
