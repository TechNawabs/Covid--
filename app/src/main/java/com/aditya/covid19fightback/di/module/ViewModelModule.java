package com.aditya.covid19fightback.di.module;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.aditya.covid19fightback.di.util.ViewModelKey;
import com.aditya.covid19fightback.ui.daily.DailyViewModel;
import com.aditya.covid19fightback.viewmodel.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(DailyViewModel.class)
    abstract ViewModel bindDailyRepositoryResponse(DailyViewModel repositoryResponseViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindTrendingRepositoryResponseFactory(ViewModelFactory viewModelFactory);
}
