package com.zh.program.Common;

/**
 * Created by Administrator on 2018/7/16 0016.
 */
public class Constants {
    /**
     * 随机数
     */
    public static final String[] ROUND_NUM={"1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    public static  final String TOKEN="token";
    public static  final String PARAM="params";
    public static  final String SIGN="sign";
    public static  final String SECRETKEY = "secret_key";
    public static  final String CURRENT_USER="user";

    //RSA密钥
    public static final String 	RSA_PRIVATE_KEY="MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKvGZp9DDKCO/9fwG0qYB0xCLROXk2RSIXX5uc7GfIfo9qjNbU9UwA0Zk0aQP176Dny5wcQlIbowdQHCGWCkeOxRrX66htT/NBCSZjQL6sQLSzEr7c5QX6FtrCgolfPGVZI7o/dPF273y3ebK4v0QSDyUikiGTcv52b3gz38IwKTAgMBAAECgYBYRiIQsDU6AaLKxrJPuCbv8oYVrmxpPqfBZ+8rqubuNTMk9kS5YvU7BiygM5rNZTWytQc1lFtrwmEu4R+HgZ4+A+vKUL+Dpw0BGypgkOjDByaOlWlVBpJu8RR+hE4mdV6MDEz2oqrdRobTwM4jvIuNpzCCHULekTytkrl0oYqdKQJBANh0lNonz/gOve/xjG0ESycaSpDz9XEiCAsWrT0gxfNQgIW9juvxu7ZYAvN+AgINH+1W1VhzWBMjg1cI9zOb9ncCQQDLKCimhRk2W/tNqyJqX6iDbmOEB1X+51Ra25ix8TGosFXwmpQ0CfqqbhhAEx3pucKnXUvqJKFKi5LQ0ianNa/FAkEApHgo5n6bymtBLUGHpwo9JHAYun10QMtP+0T2y1zMrG29ymFXaLZcIFhNncBgPDjGyqtRHo0+HgS89nQMiX13TwJARJTuBCjydfNfRrz7BUX9sUDWv39qfH7Db1iql4eA6B1/JZZJabfksxwve5H4iyp2l+Fa+1QaTvwHOA95lQD+sQJBAKrexoS2kePfP0F1bLSgTNcV8eZO+mDxWVxFwl9HeMvm3ybj9dlytO7X2rri1IoVeSOCOu2dnuFKiHSWUCodteo=";
    public static final String 	RSA_PUBLIC_KEY="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCrxmafQwygjv/X8BtKmAdMQi0Tl5NkUiF1+bnOxnyH6PaozW1PVMANGZNGkD9e+g58ucHEJSG6MHUBwhlgpHjsUa1+uobU/zQQkmY0C+rEC0sxK+3OUF+hbawoKJXzxlWSO6P3Txdu98t3myuL9EEg8lIpIhk3L+dm94M9/CMCkwIDAQAB";
    public static final int TIMEOUTINTERVAL = 10000000;

    /**
     * 应用授权作用域
     */
    //不弹出授权页面，直接跳转，只能获取用户openid
    public final static String SNSAPI_BASE = "snsapi_base";
    //弹出授权页面，可通过openid拿到昵称、性别、所在地。并且， 即使在未关注的情况下，只要用户授权，也能获取其信息
    public final static String SNSAPI_USERINFO = "snsapi_userinfo";

    // 凭证获取（GET）
    public final static String TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";

    // 用户同意授权,获取code
    public final static String WX_OAUTH_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";

    // 用户同意授权,回调url 分享内容
    public final static String WX_REDIRECT_URL = "http://tlhe.cn/web.html";

    //用户同意授权,回调url 查询个人分享信息
    public final static String WX_REDIRECT_URL_QUERY_INFO = "http://tlhe.cn/query.html";

    // 拉去用户信息url
    public final static String WX_SNSAPI_URL = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";

    public final static String WX_MIN_PROGRAM_SNSAPI_URL = "https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=CODE&grant_type=authorization_code";

    //微信openId
    public final static String WX_OPEN_ID = "wx7968b1618f078cc4";

    //微信appSecret
    public final static String WX_APP_SECRET = "8292b0a21e4f201417706ec5ee24f832";

    //用户身份 用户
    public final static Integer STATUS_USER = 0;
    //用户身份 商户
    public final static Integer STATUS_MERCHANT = 1;

    //授权类型 微信
    public final static Integer AUTHORIZE_WECHAT = 0;

}
