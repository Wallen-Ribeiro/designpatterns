public class StringReplacer implements StringTransformer{
    private char now;
    private char changed;

    public void setNow(char now) {
        this.now = now;
    }

    public void setChanged(char changed) {
        this.changed = changed;
    }

    public StringReplacer(char now, char changed){
        this.now = now;
        this.changed = changed;
    }

    @Override
    public void execute(StringDrink drink) {
        String tmp = drink.getText().replace(now, changed);
        drink.setText(tmp);
    }
}
