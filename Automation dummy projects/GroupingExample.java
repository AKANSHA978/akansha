import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"smoke"})
    public void loginTest() {
        System.out.println("Login test - Smoke");
    }

    @Test(groups = {"regression"})
    public void addToCartTest() {
        System.out.println("Add to cart - Regression");
    }

    @Test(groups = {"smoke", "regression"})
    public void logoutTest() {
        System.out.println("Logout test - Smoke & Regression");
    }
}
