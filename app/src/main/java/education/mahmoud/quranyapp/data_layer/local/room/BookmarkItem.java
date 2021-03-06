package education.mahmoud.quranyapp.data_layer.local.room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "bookmark")
public class BookmarkItem {

    @PrimaryKey(autoGenerate = true)
    private int id ;
    private long timemills ;
    private int scrollIndex ;
    private int pageNum ;
    private String suraName ;

    public BookmarkItem(int id, long timemills, int scrollIndex, int pageNum, String suraName) {
        this.id = id;
        this.timemills = timemills;
        this.scrollIndex = scrollIndex;
        this.pageNum = pageNum;
        this.suraName = suraName;
    }

    @Ignore
    public BookmarkItem() {
    }

    @Ignore
    public BookmarkItem(long timemills, int scrollIndex, int pageNum, String suraName) {
        this.timemills = timemills;
        this.scrollIndex = scrollIndex;
        this.pageNum = pageNum;
        this.suraName = suraName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTimemills() {
        return timemills;
    }

    public void setTimemills(long timemills) {
        this.timemills = timemills;
    }

    public int getScrollIndex() {
        return scrollIndex;
    }

    public void setScrollIndex(int scrollIndex) {
        this.scrollIndex = scrollIndex;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getSuraName() {
        return suraName;
    }

    public void setSuraName(String suraName) {
        this.suraName = suraName;
    }
}
