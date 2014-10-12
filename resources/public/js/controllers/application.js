RecipeTracker.ApplicationController = Ember.Controller.extend();

RecipeTracker.recipesController = Ember.ArrayController.createWithMixins({
    model: [],
    addItem: function(item) {
        this.addObject(item);
    }});

RecipeTracker.selectedRecipeController = Ember.ObjectController.createWithMixins({
    selectedRecipe: [],
    select: function(item) {
        this.set('selectedRecipe', item);
    }});

