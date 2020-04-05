package com.aditya.covid19fightback.data.rest.raw;

import com.aditya.covid19fightback.data.model.raw.RawStat;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class RawRepository {

    private final RawService rawService;

    @Inject
    public RawRepository(RawService rawService) {
        this.rawService = rawService;
    }

    public Single<RawStat> loadRawDataStats() {
        return rawService.loadRawDataStat();
    }

}
