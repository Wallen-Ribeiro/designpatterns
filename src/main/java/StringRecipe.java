import java.util.List;

public class StringRecipe{
    private List<StringTransformer> l;
    public StringRecipe(List<StringTransformer> list){
        this.l=list;
    }
    public void mix(StringDrink sd){
        for (StringTransformer st: l){
            st.execute(sd);
        }

    }
}
