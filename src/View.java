import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

public class View {
    public static void menu(){
//        while (true) {
//            System.out.println("========== StaffManagementSystem =============");
//            System.out.println("1. Insert Employee (id auto increment)");
//            System.out.println("2. Update Employee");
//            System.out.println("3. Display Employee");
//            System.out.println("4. Remove Employee");
//            System.out.println("5. Exit");
//            System.out.print("Choose an option: ");
//            int option = ValidateInput.getIntInput();
//
//            switch (option) {
//                case 1:
//                    StaffManagementSystem.insertEmployee();
//                    break;
//                case 2:
//                    StaffManagementSystem.updateEmployee();
//                    break;
//                case 3:
//                    StaffManagementSystem.displayEmployee();
//                    break;
//                case 4:
//                    StaffManagementSystem.removeEmployee();
//                    break;
//                case 5:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Invalid option. Try again.");
//            }
//        }
        while (true) {
            System.out.println("\uD83C\uDFE6".repeat(65));
            Table table = new Table(3, BorderStyle.UNICODE_BOX_HEAVY_BORDER, ShownBorders.ALL);

            table.addCell(StaffManagementSystem.PURPLE + " STAFF MANAGEMENT SYSTEM " +  StaffManagementSystem.RESET, new CellStyle(CellStyle.HorizontalAlign.CENTER), 3);
            table.addCell(StaffManagementSystem.CYAN + "1. INSERT EMPLOYEE " + StaffManagementSystem.RESET, new CellStyle(CellStyle.HorizontalAlign.CENTER));
            table.addCell(StaffManagementSystem.CYAN + "2. UPDATE EMPLOYEE" + StaffManagementSystem.RESET, new CellStyle(CellStyle.HorizontalAlign.CENTER));
            table.addCell(StaffManagementSystem.CYAN + "3. DISPLAY EMPLOYEE" + StaffManagementSystem.RESET, new CellStyle(CellStyle.HorizontalAlign.CENTER));
            table.addCell(StaffManagementSystem.CYAN + "4. REMOVE EMPLOYEE" + StaffManagementSystem.RESET, new CellStyle(CellStyle.HorizontalAlign.CENTER));
            table.addCell(StaffManagementSystem.CYAN + "5. Exit" + StaffManagementSystem.RESET, new CellStyle(CellStyle.HorizontalAlign.CENTER));

            table.setColumnWidth(0, 50, 65);
            table.setColumnWidth(1, 50, 65);
            table.setColumnWidth(2, 50, 65);

            System.out.println(table.render());
            System.out.println(" \t".repeat(28) + StaffManagementSystem.RED + "©️ Copyright-Korea Software HRD Center" + StaffManagementSystem.RESET);
            System.out.println("\uD83C\uDFE6".repeat(65));

            System.out.print(StaffManagementSystem.PURPLE + "[+] Insert option(1-5): " + StaffManagementSystem.RESET);

            int option = ValidateInput.getIntInput();

            switch (option) {
                case 1 -> StaffManagementSystem.insertEmployee();
                case 2 -> StaffManagementSystem.updateEmployee();
                case 3 -> StaffManagementSystem.displayEmployee();
                case 4 -> StaffManagementSystem.removeEmployee();
                case 5 -> {
                    System.out.print(StaffManagementSystem.GREEN + "\n\uD83E\uDD14 Are you sure you want to exit? (Y/N): " + StaffManagementSystem.RESET);
                    String confirmExit = StaffManagementSystem.sc.nextLine();
                    if (confirmExit.equalsIgnoreCase("Y")) {
                        System.out.println(StaffManagementSystem.BLUE + "\uD83D\uDD1A Exiting the system. Thank You \uD83D\uDE0A❣\uFE0F" + StaffManagementSystem.RESET);
                        System.exit(0);
                    }
                }
                default ->
                        System.out.println(StaffManagementSystem.RED +"❌ Invalid choice, please choose a valid option." +StaffManagementSystem.RESET);
            }
        }
    }
    public static void displayStaff(){

    }
}

