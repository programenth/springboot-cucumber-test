package com.example.test.config;

import org.springframework.test.context.ActiveProfilesResolver;

public class EnvResolver implements ActiveProfilesResolver {
    private static final String PROFILE_KEY = "spring.profiles.active";

    private static final String DEFAULT_PROFILE = "dev";

    @Override
    public String[] resolve(Class<?> testClass) {

        String activeProfile = System.getProperty(PROFILE_KEY);

        if (activeProfile == null || activeProfile.isEmpty()) {
            activeProfile = DEFAULT_PROFILE;
        }

        return new String[] { activeProfile };
    }
}

