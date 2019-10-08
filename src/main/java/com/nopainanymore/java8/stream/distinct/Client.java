package com.nopainanymore.java8.stream.distinct;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * java8: Client
 *
 * @author nopainanymore
 * @version 2019-10-08 20:02
 */
@Slf4j
public class Client {

    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonStr = "[\n" +
                "  {\n" +
                "    \"id\": 1016,\n" +
                "    \"pageKey\": \"d288dc2783384bc7a0d290b86899020c\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"12\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570521897000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"29fde88202134aaa9513d5cd77872c96\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1016,\n" +
                "    \"pageKey\": \"d288dc2783384bc7a0d290b86899020c\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"12\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570521897000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"29fde88202134aaa9513d5cd77872c96\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1016,\n" +
                "    \"pageKey\": \"d288dc2783384bc7a0d290b86899020c\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"12\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570521897000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"4d26d3d2e6374aa5bffc33e16e811118\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1016,\n" +
                "    \"pageKey\": \"d288dc2783384bc7a0d290b86899020c\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"12\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570521897000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"Suning_inapp\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1016,\n" +
                "    \"pageKey\": \"d288dc2783384bc7a0d290b86899020c\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"12\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570521897000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"e220c7a823e54f6aada37d97465475d3\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1016,\n" +
                "    \"pageKey\": \"d288dc2783384bc7a0d290b86899020c\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"12\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570521897000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"Suning_PCbrowser\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1016,\n" +
                "    \"pageKey\": \"d288dc2783384bc7a0d290b86899020c\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"12\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570521897000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"Suning_PCbrowser\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1016,\n" +
                "    \"pageKey\": \"d288dc2783384bc7a0d290b86899020c\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"12\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570521897000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"2f45a0d15bec4489aeec2bceb5d66ea2\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1016,\n" +
                "    \"pageKey\": \"d288dc2783384bc7a0d290b86899020c\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"12\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570521897000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"Suning_WAP\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1016,\n" +
                "    \"pageKey\": \"d288dc2783384bc7a0d290b86899020c\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"12\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570521897000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"Suning_WAP\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1016,\n" +
                "    \"pageKey\": \"d288dc2783384bc7a0d290b86899020c\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"12\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570521897000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"Suning_WeixinMiniProgram\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1017,\n" +
                "    \"pageKey\": \"654f11096c0f4d8a84d30d20fae42874\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"你好\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570522457000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"29fde88202134aaa9513d5cd77872c96\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1017,\n" +
                "    \"pageKey\": \"654f11096c0f4d8a84d30d20fae42874\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"你好\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570522457000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"29fde88202134aaa9513d5cd77872c96\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1017,\n" +
                "    \"pageKey\": \"654f11096c0f4d8a84d30d20fae42874\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"你好\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570522457000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"4d26d3d2e6374aa5bffc33e16e811118\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1017,\n" +
                "    \"pageKey\": \"654f11096c0f4d8a84d30d20fae42874\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"你好\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570522457000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"Suning_inapp\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1017,\n" +
                "    \"pageKey\": \"654f11096c0f4d8a84d30d20fae42874\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"你好\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570522457000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"e220c7a823e54f6aada37d97465475d3\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1017,\n" +
                "    \"pageKey\": \"654f11096c0f4d8a84d30d20fae42874\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"你好\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570522457000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"Suning_PCbrowser\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1017,\n" +
                "    \"pageKey\": \"654f11096c0f4d8a84d30d20fae42874\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"你好\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570522457000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"Suning_PCbrowser\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1017,\n" +
                "    \"pageKey\": \"654f11096c0f4d8a84d30d20fae42874\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"你好\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570522457000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"2f45a0d15bec4489aeec2bceb5d66ea2\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1017,\n" +
                "    \"pageKey\": \"654f11096c0f4d8a84d30d20fae42874\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"你好\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570522457000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"Suning_WAP\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1017,\n" +
                "    \"pageKey\": \"654f11096c0f4d8a84d30d20fae42874\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"你好\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570522457000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"Suning_WAP\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1017,\n" +
                "    \"pageKey\": \"654f11096c0f4d8a84d30d20fae42874\",\n" +
                "    \"pageName\": \"登录\",\n" +
                "    \"pageURL\": \"你好\",\n" +
                "    \"owner\": \"12111287\",\n" +
                "    \"updateTime\": 1570522457000,\n" +
                "    \"totalPages\": 0,\n" +
                "    \"productCode\": \"snyg20181224162530\",\n" +
                "    \"orderNum\": 0,\n" +
                "    \"client\": \"Suning_WeixinMiniProgram\",\n" +
                "    \"isPrefixMatching\": 1\n" +
                "  }\n" +
                "]";

        List<Page> pageList = gson.fromJson(jsonStr, new TypeToken<List<Page>>() {
        }.getType());

        Map<String, Map<String, String>> collect = pageList.stream()
                .map(PageMeta::new)
                .distinct()
                .collect(groupingBy(PageMeta::getClient, Collectors.toMap(PageMeta::getPageUrl, PageMeta::getPageName)));
        log.info("Client- main- method1 {}", gson.toJson(collect));

        Map<String, Map<String, String>> staticMethod = pageList.stream()
                .filter(Page.distinctByKey(page -> page.getClient() + page.getPageURL() + page.getPageName()))
                .collect(groupingBy(Page::getClient, Collectors.toMap(Page::getPageURL, Page::getPageName)));
        log.info("Client- main- method2 {}", gson.toJson(staticMethod));


    }

}
