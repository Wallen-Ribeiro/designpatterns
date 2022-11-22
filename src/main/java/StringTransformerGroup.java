import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    List<StringTransformer> l;
    public StringTransformerGroup(List<StringTransformer> list){
        this.l=list;
    }

    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer st: l){
            st.execute(drink);
        }
    }

}
