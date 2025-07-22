package guru.qa.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Feature("Авторизация")
public class GoogleAuthTest {

    @Test
    @AllureId("1")
    @DisplayName("Авторизация через Google с валидными данными")
    @Story("Внешняя авторизация")
    @Owner("sergey.dubinin.work")
    void testAuth() {
        step("Открываем главную страницу");
        step("Выбираем способ авторизации через Google");
        step("Заполняем форму авторизации", () -> {
            step("Вводим Логин 123");
            step("Вводим пароль 123");
            step("Нажимаем кнопку Войти");
        });
        step("Проверяем, что авторизовались успешно");
        step("Проверяем, что данные профиля отобразились", () -> {
            step("Логин: 123");
            step("Имя 123");
            step("Аватарка");
        });
    }


}
