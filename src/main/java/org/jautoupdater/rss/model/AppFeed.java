package org.jautoupdater.rss.model;

import java.util.ArrayList;
import java.util.List;

/**
* Stores information about an app feed rss. Includes
* information about the title of the feed, the location of
* the feed, language and the description of the feed. Most
* importantly, it contains a {@link java.util.List} of 
* {@link org.jautoupdater.rss.AppFeedItem}s.
*
* @author Jeffrey Walraven
*/
public class AppFeed {

    final String title;
    final String link;
    final String description;
    final String language;
    final String copyright;
    final String pubdate;

    // Create a list of AppFeedItems
    public List<AppFeedItem> items = new ArrayList<AppFeedItem>();

    /**
     * Construct the {@link AppFeed} with all the app feed properties.
     * @param title The title of the app feed
     * @param link The URL link to the app feed
     * @param description The description of the app feed
     * @param language The language the app feed reports in
     */
    public AppFeed(String title, String link, String description, String language, String copyright, String pubdate) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.language = language;
        this.copyright = copyright;
        this.pubdate = pubdate;
    }
    
    /**
     * Get the title of the app rss feed.
     * @return The String title
     */
    public String getTitle() {
        return this.title;
    }
    
    /**
     * Get the URL link to the app rss feed.
     * @return The String URL link
     */
    public String getLink() {
        return this.link;
    }
    
    /**
     * Get the description of the app rss feed.
     * @return The String description
     */
    public String getDescription() {
        return this.description;
    }
    
    /**
     * Get the language of the app rss feed.
     * @return The String representation of the language name
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Get the copyright of the app rss feed.
     * @return The String copyright
     */
    public String getCopyright() {
        return this.copyright;
    }

    /**
     * Get the publish date of the app rss feed.
     * @return The String publish date
     */
    public String getPublishDate() {
        return this.pubdate;
    }

    @Override
    public String toString() {
        // Add all the values to a String and return it
        String returnString = "AppFeed (";
        returnString += title + ", ";
        returnString += link + ", ";
        returnString += description + ", ";
        returnString += language + ", ";
        returnString += copyright + ", ";
        returnString += pubdate;
        returnString += ")";
        return returnString;
    }
}
