package currency.main;

import java.util.Map;

public class RequestData {
  private final String result;
  private final String documentation;
  private final String term_of_use;
  private final int time_last_update_unix;
  private final String time_last_update_utc;
  private final int time_next_update_unix;
  private final String time_next_update_utc;
  private final String base_code;
  private Map<String, Double> conversion_rates;

  public RequestData(String result, String documentation, String term_of_use, int time_last_update_unix, String time_last_update_utc,
                     int time_next_update_unix, String time_next_update_utc, String base_code, Map<String, Double> conversion_rates) {
    this.result = result;
    this.documentation = documentation;
    this.term_of_use = term_of_use;
    this.time_last_update_unix = time_last_update_unix;
    this.time_last_update_utc = time_last_update_utc;
    this.time_next_update_unix = time_next_update_unix;
    this.time_next_update_utc = time_next_update_utc;
    this.base_code = base_code;
    this.conversion_rates = conversion_rates;
  }

  public Map<String, Double> getConversion_rates() {
    return this.conversion_rates;
  }
}
