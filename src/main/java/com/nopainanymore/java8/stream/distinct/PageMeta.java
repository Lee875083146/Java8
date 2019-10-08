package com.nopainanymore.java8.stream.distinct;

import lombok.Getter;

/**
 * java8: PageMeta
 *
 * @author nopainanymore
 * @version 2019-10-08 20:01
 */
@Getter
public class PageMeta {

    private String client;

    private String pageUrl;

    private String pageName;

    public PageMeta(Page page) {
        this.client = page.getClient();
        this.pageUrl = page.getPageURL();
        this.pageName = page.getPageName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof PageMeta) {
            PageMeta pageMeta = (PageMeta) obj;
            return (this.client.equals(pageMeta.getClient()) && this.pageUrl.equals(pageMeta.getPageUrl()) && this.pageName.equals(pageMeta.getPageName()));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (this.client + this.pageUrl + this.pageName).hashCode();
    }
}
