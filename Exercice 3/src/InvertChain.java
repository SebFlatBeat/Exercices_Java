public class InvertChain {

    private String initial = "Java Interview";
    private StringBuffer stringBuffer = (new StringBuffer(initial)).reverse();

    protected StringBuffer getStringBuffer() {
        return stringBuffer;
    }

}
