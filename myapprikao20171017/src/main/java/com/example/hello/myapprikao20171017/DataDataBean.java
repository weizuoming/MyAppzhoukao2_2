package com.example.hello.myapprikao20171017;

import java.util.List;

/**
 * Created by 韦作铭 on 2017/10/17.
 */

public class DataDataBean {

    /**
     * code : 1
     * success : true
     * height : 0
     * width : 0
     * data : [{"userImg":"http://img1.yulin520.com/news/HPUCVP74IFR0OKCZ9QQH.jpg#405_304","impressEditId":334,"impressType":0,"introduction":"83年/巨蟹座/ 开朗幽默，热情善良，追求刺激/喜欢温柔，体贴，可爱，善良的女孩/金融","replyTimes":17,"remark":"","click":0,"occupation":"证劵投资","topTime":1469503026000,"recommend":0,"url":"http://www.yulin520.com/a2a/h5/impress/i1/334?a=1508236817592","title":"刘峰鸣 ：能文能武，Call Me峰鸣哥","star":58,"createTime":1466160199000,"hxKey":"60fd9c2377f81ba1ccca450fb794e016","img":"http://img1.yulin520.com/news/HPUCVP74IFR0OKCZ9QQH.jpg#405_304","yulin":"81373","userAge":33,"source":0,"userName":"刘LLL","reporter":0,"status":1,"content":""},{"userImg":"http://img1.yulin520.com/news/BPKZUX0MNFR0OT0WLCOD.png#598_450","impressEditId":319,"impressType":0,"introduction":"91年/处女座/性格直白，爱好广泛，有点女汉子/喜欢性格开朗，三观契合，高冷文艺范，有肌肉，175+/公司职业","replyTimes":12,"remark":"","click":0,"occupation":"保险","topTime":1469503022000,"recommend":0,"url":"http://www.yulin520.com/a2a/h5/impress/i1/319?a=1508236817592","title":"刘佳怡 ：直白女汉子也有个文艺梦","star":77,"createTime":1465380170000,"hxKey":"dac884f7cc81691ba28a004091cbe122","img":"http://img1.yulin520.com/news/BPKZUX0MNFR0OT0WLCOD.png#598_450","yulin":"80821","userAge":25,"source":0,"userName":"嘉咦咦咦","reporter":0,"status":1,"content":""},{"userImg":"http://img1.yulin520.com/news/UPPN83L0IFR0OBC1A4AK.jpg#800_600","impressEditId":324,"impressType":0,"introduction":"87年/处女座/善良可爱，安静温柔，爱独立思考/喜欢三观相似，经历相似，性格活泼的女孩/互联网设计师 ","replyTimes":13,"remark":"","click":0,"occupation":"互联网","topTime":1468980785000,"recommend":0,"url":"http://www.yulin520.com/a2a/h5/impress/i1/324?a=1508236817592","title":"陈松 ：爱搞新花样的设计师","star":52,"createTime":1465722569000,"hxKey":"ebf75ccd1fba85f248988d40e572914e","img":"http://img1.yulin520.com/news/UPPN83L0IFR0OBC1A4AK.jpg#800_600","yulin":"80569","userAge":29,"source":0,"userName":"Song","reporter":0,"status":1,"content":""},{"userImg":"http://img1.yulin520.com/news/SPPW8T9QHFR0OM3HID0X.jpg#1280_960","impressEditId":323,"impressType":0,"introduction":"90年/天蝎座/爱美食，爱分享，有点内向/喜欢阳光，干净，175+的男孩子/银行接待","replyTimes":16,"remark":"","click":0,"occupation":"银行","topTime":1468980773000,"recommend":0,"url":"http://www.yulin520.com/a2a/h5/impress/i1/323?a=1508236817592","title":"秦心 ：外形不娇小，心思很细腻","star":101,"createTime":1465721939000,"hxKey":"580786532670bc072b0aeb795bd6ddc7","img":"http://img1.yulin520.com/news/SPPW8T9QHFR0OM3HID0X.jpg#1280_960","yulin":"80983","userAge":26,"source":0,"userName":"秦心","reporter":0,"status":1,"content":""},{"userImg":"http://img1.yulin520.com/news/XPW8OZXMSFR0O015UA7D.jpg#598_597","impressEditId":337,"impressType":0,"introduction":"93年/水瓶座/温柔体贴，踏实细心/喜欢三观相符的女孩子/前端工程师","replyTimes":17,"remark":"","click":0,"occupation":"互联网","topTime":1468574992000,"recommend":0,"url":"http://www.yulin520.com/a2a/h5/impress/i1/337?a=1508236817592","title":"温其堂 ：细心温柔IT\u201c熊猫\u201d男","star":55,"createTime":1466162998000,"hxKey":"37dee7aaed1862c64c4fe38d75ccd52a","img":"http://img1.yulin520.com/news/XPW8OZXMSFR0O015UA7D.jpg#598_597","yulin":"81316","userAge":23,"source":0,"userName":"榴莲","reporter":0,"status":1,"content":""}]
     * message : null
     */

    private int code;
    private boolean success;
    private int height;
    private int width;
    private Object message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * userImg : http://img1.yulin520.com/news/HPUCVP74IFR0OKCZ9QQH.jpg#405_304
         * impressEditId : 334
         * impressType : 0
         * introduction : 83年/巨蟹座/ 开朗幽默，热情善良，追求刺激/喜欢温柔，体贴，可爱，善良的女孩/金融
         * replyTimes : 17
         * remark :
         * click : 0
         * occupation : 证劵投资
         * topTime : 1469503026000
         * recommend : 0
         * url : http://www.yulin520.com/a2a/h5/impress/i1/334?a=1508236817592
         * title : 刘峰鸣 ：能文能武，Call Me峰鸣哥
         * star : 58
         * createTime : 1466160199000
         * hxKey : 60fd9c2377f81ba1ccca450fb794e016
         * img : http://img1.yulin520.com/news/HPUCVP74IFR0OKCZ9QQH.jpg#405_304
         * yulin : 81373
         * userAge : 33
         * source : 0
         * userName : 刘LLL
         * reporter : 0
         * status : 1
         * content :
         */

        private String userImg;
        private int impressEditId;
        private int impressType;
        private String introduction;
        private int replyTimes;
        private String remark;
        private int click;
        private String occupation;
        private long topTime;
        private int recommend;
        private String url;
        private String title;
        private int star;
        private long createTime;
        private String hxKey;
        private String img;
        private String yulin;
        private int userAge;
        private int source;
        private String userName;
        private int reporter;
        private int status;
        private String content;

        public String getUserImg() {
            return userImg;
        }

        public void setUserImg(String userImg) {
            this.userImg = userImg;
        }

        public int getImpressEditId() {
            return impressEditId;
        }

        public void setImpressEditId(int impressEditId) {
            this.impressEditId = impressEditId;
        }

        public int getImpressType() {
            return impressType;
        }

        public void setImpressType(int impressType) {
            this.impressType = impressType;
        }

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

        public int getReplyTimes() {
            return replyTimes;
        }

        public void setReplyTimes(int replyTimes) {
            this.replyTimes = replyTimes;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public int getClick() {
            return click;
        }

        public void setClick(int click) {
            this.click = click;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public long getTopTime() {
            return topTime;
        }

        public void setTopTime(long topTime) {
            this.topTime = topTime;
        }

        public int getRecommend() {
            return recommend;
        }

        public void setRecommend(int recommend) {
            this.recommend = recommend;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getStar() {
            return star;
        }

        public void setStar(int star) {
            this.star = star;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public String getHxKey() {
            return hxKey;
        }

        public void setHxKey(String hxKey) {
            this.hxKey = hxKey;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getYulin() {
            return yulin;
        }

        public void setYulin(String yulin) {
            this.yulin = yulin;
        }

        public int getUserAge() {
            return userAge;
        }

        public void setUserAge(int userAge) {
            this.userAge = userAge;
        }

        public int getSource() {
            return source;
        }

        public void setSource(int source) {
            this.source = source;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getReporter() {
            return reporter;
        }

        public void setReporter(int reporter) {
            this.reporter = reporter;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
