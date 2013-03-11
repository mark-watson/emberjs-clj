RecipeTracker = Ember.Application.create({
	ready: function() {
	    this._super();
		RecipeTracker.GetRecipeItems();   // this triggers an AJAX call to Clojure REST interface
	}
});