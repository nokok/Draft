package net.nokok.testdata;

import net.nokok.draft.Module;

@Module
public interface ServiceModule {
    ServiceImpl bind(Service s);
}
