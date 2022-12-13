package com.mafugo.awsimageupload.datastore;

import com.mafugo.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("ac8bf3d7-48ab-483e-aa6a-70b4b929b356"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("195eec54-b582-49aa-aa0c-ea5452daa8d2"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
