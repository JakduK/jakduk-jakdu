package com.jakduk.jakdu.crawler;

import com.jakduk.jakdu.common.util.ObjectMapperUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.util.LinkedMultiValueMap;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

/**
 * Created by pyohwan on 16. 11. 13.
 */

public class CrawlerTest {

    private TestRestTemplate template = new TestRestTemplate();

    // K리그 홈페이지 개편되며 사라졌음
    @Ignore
    @Test
    public void getKLeagueSchedules() throws Exception {

        Document doc = Jsoup.connect("http://www.kleague.com/KOR_2016/record/data_2.asp?year=2016&game=1&game_type=#").get();

        Elements tableTr = doc.select("table > tbody > tr");

        tableTr.forEach(tr -> {
                    Elements tableTd = tr.getElementsByTag("td");

                    System.out.println("size=" + tableTd.size());

                    tableTd.forEach(td -> {
                        System.out.println("td=" + td.text());
                    });

                    System.out.println("-----");
                }

        );
    }

    @Test
    public void getKLeagueSchedulesWithRestTemplate() throws URISyntaxException, IOException {

        RequestEntity requestEntity = RequestEntity.post(new URI("http://www.kleague.com/userpage/data_func.php"))
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .body(
                        new LinkedMultiValueMap<String, String>() {{
                            add("data_type", "match_schedule");
                            add("meet_year", "2017");
                            add("meet_seq", "1");
                        }}
                );

        String schedules = template.exchange(requestEntity, String.class).getBody();

        Map<String, Object> map = ObjectMapperUtils.readValue(schedules, Map.class);

        System.out.println("schedules" + map);
    }
}
