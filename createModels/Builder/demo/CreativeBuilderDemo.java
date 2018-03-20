public class creativeBuilderDemo{
    public static void main(String[] args){
        CreativeBuilder creativeBuilder = new CreativeBuilder();

        System.out.println("prepare tencent creative");
        Tencent tencentCreative = creativeBuilder.prepareTencentCreative();

        System.out.println("prepare baidu creative");
        Tencent tencentCreative = creativeBuilder.prepareBaiduCreative();

        System.out.println("prepare ali creative");
        Tencent tencentCreative = creativeBuilder.prepareAliCreative();
    }
}