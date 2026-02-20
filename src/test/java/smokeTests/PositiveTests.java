package smokeTests;

import config.TestBase;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

public class PositiveTests extends TestBase {

    @Test
    @Feature("Main page")
    @Owner("Kratakey")
    @Story("Opening main page")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Main page can be opened and loaded")
    void openMainPage() {
    }

    @Test
    @Feature("Search")
    @Owner("Kratakey")
    @Story("Finding search results")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Search results can be opened and displayed")
    void searchResultsCanBeLoaded() {
    }

    @Test
    @Feature("Payment")
    @Owner("Kratakey")
    @Story("Visiting paying online page")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Pay online is loading")
    void payOnlineFormLoads() {
    }

    @Test
    @Feature("Payment")
    @Owner("Kratakey")
    @Story("Visiting paying online page")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Pay online is working")
    void payOnlineFormWorks() {
    }

    @Test
    @Feature("Search")
    @Owner("Kratakey")
    @Story("Starting room reservation process")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Can start reserving a room")
    void reserveARoomOpens() {
    }

    @Test
    @Feature("Search")
    @Owner("Kratakey")
    @Story("Complete room reservation")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Reservation is working")
    void reserveARoomComplete() {
    }
}