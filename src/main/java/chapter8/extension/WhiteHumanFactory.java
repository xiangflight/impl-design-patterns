package chapter8.extension;

import chapter8.IHuman;
import chapter8.WhiteHuman;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 4:06 下午
 */

public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public IHuman createHuman() {
        return new WhiteHuman();
    }
}
