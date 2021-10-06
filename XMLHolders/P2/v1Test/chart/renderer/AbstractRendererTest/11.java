@Test
    public void testSerialization() {
        BarRenderer r1 = new BarRenderer();
        r1.setDefaultLegendTextFont(new Font("Dialog", Font.PLAIN, 4));
        r1.setDefaultLegendTextPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.GREEN));
        r1.setDefaultLegendShape(new Line2D.Double(1.0, 2.0, 3.0, 4.0));
        BarRenderer r2 = (BarRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
        try {
            r2.notifyListeners(new RendererChangeEvent(r2));
        }
        catch (NullPointerException e) {
            fail("No exception should be thrown.");  // failed
        }
    }

    