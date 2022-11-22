import java.util.List;

import static java.lang.Character.isUpperCase;

public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String tmp = "";
        char a;
        for (int i = 0; i < drink.getText().length(); i++){
            if (Character.isLowerCase(drink.getText().charAt(i))){
                a = Character.toUpperCase(drink.getText().charAt(i));
            }
            else {
                a = Character.toLowerCase(drink.getText().charAt(i));
            }
            tmp += a;
        }
        drink.setText(tmp);
    }
}
