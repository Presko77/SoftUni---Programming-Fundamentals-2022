package Maps_Lambda_and_Stream_API_Exercise;

import java.util.*;

public class P08Company_Users {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String empresa, empleadoID;
        LinkedHashMap<String, List<String>> companiaRegistro = new LinkedHashMap<>();

        while (!input.equals("End")) {
            empresa = input.split(" -> ")[0];
            empleadoID = input.split(" -> ")[1];
            if (companiaRegistro.containsKey(empresa)) {
                List<String> empleados = companiaRegistro.get(empresa);
                if (!empleados.contains(empleadoID))
                    empleados.add(empleadoID);
            } else {
                List<String> empleados = new ArrayList<>();
                empleados.add(empleadoID);
                companiaRegistro.put(empresa, empleados);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companiaRegistro.entrySet()) {
            System.out.printf("%s%n-- %s%n",entry.getKey(),String.join("\n-- ",entry.getValue()));
        }
    }
}
