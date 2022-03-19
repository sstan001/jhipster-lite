package tech.jhipster.lite.generator.client.vue.core.domain;

import java.util.List;

public class Vue {

  public static final String ROUTER_IMPORT = "import router from \'./router/router\';";
  public static final String ROUTER_PROVIDER = "app.use(router);";

  private Vue() {}

  public static List<String> dependencies() {
    return List.of("vue");
  }

  public static List<String> routerDependencies() {
    return List.of("vue-router");
  }

  public static List<String> devDependencies() {
    return List.of(
      "@rushstack/eslint-patch",
      "@types/jest",
      "@typescript-eslint/parser",
      "@vitejs/plugin-vue",
      "@vue/eslint-config-typescript",
      "@vue/test-utils",
      "eslint",
      "eslint-config-prettier",
      "eslint-plugin-vue",
      "jest",
      "jest-sonar-reporter",
      "jest-transform-stub",
      "ts-jest",
      "typescript",
      "vite",
      "vue-jest",
      "vue-tsc"
    );
  }
}
