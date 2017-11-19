package com.patterns.patterns01.exercise02.factory.abstractFactory;

import com.patterns.patterns01.exercise02.factory.ISender;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 18:51 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *  抽象工厂
 * <BR>
 */
public interface ISenderFactory {
    ISender produce();
}
