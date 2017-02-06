package com.hhly.data.bean;

import java.util.List;

/**
 * @创建者 frank
 * @时间 2017/2/6 15:42
 * @描述：${TODO}
 */

public class NewsBean {

    /**
     * date : 20170206
     * stories : [{"ga_prefix":"020615","id":9200109,"images":["http://pic1.zhimg.com/eed01b9e53c7f80812a41c38c59138a8.jpg"],"title":"几个实用小技巧，让爸妈使用智能手机更方便","type":0},{"ga_prefix":"020614","id":9199938,"images":["http://pic4.zhimg.com/7d1519cf175039fa9b1bb6e1a65469eb.jpg"],"title":"为什么美国国父要当一名邮政局长？","type":0},{"ga_prefix":"020613","id":9199415,"images":["http://pic4.zhimg.com/3ea1e19f1347f45819b53a7c1c35565f.jpg"],"title":"《歌手》第三期，大家的水平整体下滑了","type":0},{"ga_prefix":"020612","id":9199433,"images":["http://pic4.zhimg.com/e345cd1b6ad15f8565062221f2f1ce5b.jpg"],"title":"大误 · 「我在梦里醒来」","type":0},{"ga_prefix":"020611","id":9198830,"images":["http://pic1.zhimg.com/f1204da91b9b1d71039a53679e6a08c8.jpg"],"title":"是艺术家也是时尚 icon，这是她的传奇一生","type":0},{"ga_prefix":"020610","id":9195071,"images":["http://pic4.zhimg.com/e84ea108c8967815724f966a823d2d0b.jpg"],"title":"我们感知这个世界的方式，可能从一出生就决定了","type":0},{"ga_prefix":"020609","id":9197561,"images":["http://pic3.zhimg.com/8cec702dfeac127c1f6df3b716d86792.jpg"],"title":"每天都离不开便利店，不过它们真的能赚到钱吗？","type":0},{"ga_prefix":"020608","id":9198585,"images":["http://pic4.zhimg.com/64a5ace8534ae7f562badfa7e4c3cfef.jpg"],"title":"美国发生过的杠杆收购大潮，会不会在中国出现？","type":0},{"ga_prefix":"020607","id":9198401,"images":["http://pic2.zhimg.com/13b4384639ad1a23788836f9d915032d.jpg"],"multipic":true,"title":"养猫的薛定谔说，生命现象原则上都可以用物理学来解释","type":0},{"ga_prefix":"020607","id":9170945,"images":["http://pic1.zhimg.com/2bbf77cf77e430910b84674ee26d14bc.jpg"],"title":"那些好玩的 3D 立体图如何「骗」了你的眼睛？","type":0},{"ga_prefix":"020607","id":9197566,"images":["http://pic3.zhimg.com/d114542662ddb6b3fb094356fa3e435e.jpg"],"title":"在动荡中失去曙光，这就是消费级无人机的 2016 年","type":0},{"ga_prefix":"020606","id":9194647,"images":["http://pic4.zhimg.com/3aba8bf71c97b9e81a7d237d8c566dc3.jpg"],"title":"瞎扯 · 如何正确地吐槽","type":0}]
     * top_stories : [{"ga_prefix":"020615","id":9200109,"image":"http://pic3.zhimg.com/8dd8331838a7bdc9a30a03d6afadf4de.jpg","title":"几个实用小技巧，让爸妈使用智能手机更方便","type":0},{"ga_prefix":"020613","id":9199415,"image":"http://pic4.zhimg.com/e075217893824f65eb12fd1d9ddd3db7.jpg","title":"《歌手》第三期，大家的水平整体下滑了","type":0},{"ga_prefix":"020609","id":9197561,"image":"http://pic2.zhimg.com/8ded454b2f60b6f013e8b8c9cb638bd1.jpg","title":"每天都离不开便利店，不过它们真的能赚到钱吗？","type":0},{"ga_prefix":"020607","id":9197566,"image":"http://pic1.zhimg.com/acb96fcca7a65cdfaa323397cf786980.jpg","title":"在动荡中失去曙光，这就是消费级无人机的 2016 年","type":0},{"ga_prefix":"020514","id":9197108,"image":"http://pic3.zhimg.com/823b85cc17c2dac1c3a1ee5f30d7f48a.jpg","title":"年都过完了，还是不知道「金鸡贺岁」的金鸡是什么鸡？","type":0}]
     */

    private String date;
    /**
     * ga_prefix : 020615
     * id : 9200109
     * images : ["http://pic1.zhimg.com/eed01b9e53c7f80812a41c38c59138a8.jpg"]
     * title : 几个实用小技巧，让爸妈使用智能手机更方便
     * type : 0
     */

    private List<StoriesBean> stories;
    /**
     * ga_prefix : 020615
     * id : 9200109
     * image : http://pic3.zhimg.com/8dd8331838a7bdc9a30a03d6afadf4de.jpg
     * title : 几个实用小技巧，让爸妈使用智能手机更方便
     * type : 0
     */

    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        private String ga_prefix;
        private int id;
        private String title;
        private int type;
        private List<String> images;

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return "StoriesBean{" +
                    "ga_prefix='" + ga_prefix + '\'' +
                    ", id=" + id +
                    ", title='" + title + '\'' +
                    ", type=" + type +
                    ", images=" + images +
                    '}';
        }
    }

    public static class TopStoriesBean {
        private String ga_prefix;
        private int id;
        private String image;
        private String title;
        private int type;

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "TopStoriesBean{" +
                    "ga_prefix='" + ga_prefix + '\'' +
                    ", id=" + id +
                    ", image='" + image + '\'' +
                    ", title='" + title + '\'' +
                    ", type=" + type +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "NewsBean{" +
                "date='" + date + '\'' +
                ", stories=" + stories +
                ", top_stories=" + top_stories +
                '}';
    }
}
