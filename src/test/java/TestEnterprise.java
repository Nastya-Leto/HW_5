import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class TestEnterprise {
    @Test
    void fullTestPrice() {
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("div h1").shouldHave(text("Build like the best"));
    }

        @Test
        void dragAndDropTest() {
            open("https://the-internet.herokuapp.com/drag_and_drop");
            $("#column-a").dragAndDropTo($("#column-b"));
            $("#column-a").$("header").shouldHave(text("B"));
            $("#column-b").$("header").shouldHave(text("A"));

    }
}

