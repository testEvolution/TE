@Test
    public void testSetRenderer() {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer = new LineAndShapeRenderer();
        plot.setRenderer(renderer);
        // now make a change to the renderer and see if it triggers a plot
        // change event...
        MyPlotChangeListener listener = new MyPlotChangeListener();
        plot.addChangeListener(listener);
        renderer.setSeriesPaint(0, Color.BLACK);
        assertTrue(listener.getEvent() != null);
    }

    