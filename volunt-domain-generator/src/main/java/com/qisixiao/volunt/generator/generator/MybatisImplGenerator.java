package com.qisixiao.volunt.generator.generator;

import com.qisixiao.volunt.generator.ConfigContext;

import java.io.IOException;

public class MybatisImplGenerator extends AbstractGenerator {
    @Override
    public boolean ignored(ConfigContext ctx) {
        return Boolean.valueOf(ctx.getExtConfig("ext.mybatis.ignored", "false"));
    }

    @Override
    public void generate(ConfigContext ctx) throws IOException {

    }
}
