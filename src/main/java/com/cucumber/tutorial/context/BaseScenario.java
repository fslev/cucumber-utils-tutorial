package com.cucumber.tutorial.context;

import com.cucumber.utils.context.props.ScenarioProps;
import com.cucumber.utils.context.utils.Cucumbers;
import com.cucumber.utils.context.utils.ScenarioUtils;
import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class BaseScenario {
    @Inject
    protected ScenarioUtils scenarioUtils;
    @Inject
    protected ScenarioProps scenarioProps;
    @Inject
    protected Cucumbers cucumbers;
}
