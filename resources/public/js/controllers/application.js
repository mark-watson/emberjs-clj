RecipeTracker.ApplicationController = Ember.Controller.extend();

RecipeTracker.recipesController = Ember.ArrayController.create({
    content: [],
    addItem: function(item) {
        this.addObject(item);
    }});

RecipeTracker.selectedRecipeController = Ember.ObjectController.create({
    selectedRecipe: [],
    select: function(item) {
        this.set('selectedRecipe', item);
    }});

