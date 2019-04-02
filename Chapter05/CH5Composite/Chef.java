package CH5Composite;

import java.util.ArrayList;
import java.util.List;

public class Chef implements KitchenStaff {

    private String name;
    private String role;
    private List<KitchenStaff> staffList;

    Chef(String name, String role) {
        this.name = name;
        this.role = role;
        staffList = new ArrayList<KitchenStaff>();
    }

    public void add(Chef chef) {
        staffList.add(chef);
    }

    public void fire(Chef chef) {
        staffList.remove(chef);
    }

    public List<KitchenStaff> getStaffList() {
        return staffList;
    }

    @Override
    public String getDetails() {
        return (name + " is assigned the role of " + role);
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
