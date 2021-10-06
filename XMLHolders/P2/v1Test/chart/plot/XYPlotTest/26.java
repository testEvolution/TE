@Test
    public void testRemoveAnnotation() {
        XYPlot plot = new XYPlot();
        XYTextAnnotation a1 = new XYTextAnnotation("X", 1.0, 2.0);
        XYTextAnnotation a2 = new XYTextAnnotation("X", 3.0, 4.0);
        XYTextAnnotation a3 = new XYTextAnnotation("X", 1.0, 2.0);
        plot.addAnnotation(a1);
        plot.addAnnotation(a2);
        plot.addAnnotation(a3);
        plot.removeAnnotation(a2);
        XYTextAnnotation x = (XYTextAnnotation) plot.getAnnotations().get(0);
        assertEquals(x, a1);

        // now remove a3, but since a3.equals(a1), this will in fact remove
        // a1...
        assertTrue(a1.equals(a3));
        plot.removeAnnotation(a3);  // actually removes a1
        x = (XYTextAnnotation) plot.getAnnotations().get(0);
        assertEquals(x, a3);
    }

    