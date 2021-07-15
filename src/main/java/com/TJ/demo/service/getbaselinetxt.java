package com.TJ.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import com.TJ.demo.service.impl.getbaselinetxtService;
import com.TJ.demo.entity.baselinetxt;
@Service("getbaseline")
public class getbaselinetxt implements getbaselinetxtService {
    baselinetxt result;
    @Override
    public ArrayList<String> getbasetxt(){
        ArrayList<String> testresult = new ArrayList<>();
        testresult.add("秋冬季的粉底液分享,不卡纹起皮!我的冬天会是什么样子呢?这个是我自己亲身实测的感受～首先我用的这款妆前乳。上脸比较服帖自然一点不会假面、卡纹;遮瑕和定妆也很不错,但是感觉还是更喜欢它家的粉质更好一些吧～然后就是散粉了,我觉得用海绵蛋或者喷雾来点一下就行,因为觉得喷出来的雾气更小哦～其次它的保湿能力也很好~我是直接拿个湿敷在脸上再拍打就可以了。而且他还有自带的水润感!所以我会选择使用化妆水之后补完一层妆后乳再用一个散粉或隔离喷雾打底～最后就是持久度啦");
        testresult.add("平价的医美产品,性价比不高之前用过维密、神仙水和夫西地酸(刚开始感觉完全没用)但是后来用了一段时间之后觉得不错就换了雅漾。因为第一次使用所以下巴红肿痘也继续涨了而且价格有点贵!不过敷完的地方会红红的一大片还特别痒我脸上没有过敏反应就是很温和不会刺激到眼睛后面皮肤也不会出现刺痛的问题。另外两个医院也有开这个药膏,但听说是医生在给患者打针的时候用的我觉得还不错,所以我还是买了一个去药店买。然后去医院挂专家号可以自己拿小包装放上去直接上脸涂一下就可以啦这款面膜效果挺好的我是第二天洗脸后把化妆棉浸湿以后轻轻按压就好不用担心弄疼脸部哦");
        testresult.add("好用的遮瑕液,怕是想哭啊!这个真的是我用过最好用的一个啦～对于干皮来说,除了用遮瑕去晒斑和痘印外的其它地方都不需要再涂了哈(捂脸)有黑眼圈泪沟等瑕疵的话可以用它的遮暇哦这款就是针对这种类型的皮肤。我是是那种日抛式的,所以会挑一款比较适合我的遮瑕来用的~首先它没有味道但是质地很滋润不油腻不会拔干!然后它是哑光型的而且也不会闷痘还有提亮肤色的作用️因为本身不是油性成分也不是特别粘腻所以上妆比较服帖!其次他是一个水润型产品所以我建议有黑眼圈或者泪沟痘痘妹子可以选择持妆款;如果是混油、那么可以尝试一下持妆系的产品,如果混合在两个色系中就比较好看一些:#兰蔻·小棕瓶/色号112#适合肤质:所有肌肤都可以使用,尤其是干皮,特别容易起皮,严重者还会觉得有点拔干(真的要夸一夸这个遮瑕膏,太好用了吧!)");
        result = new baselinetxt(testresult);
        return result.gettxt();

    }
}
