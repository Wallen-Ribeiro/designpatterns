public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder(drink.getText());
        StringBuilder revstr = str.reverse();
        drink.setText(revstr.toString());
    }
}
