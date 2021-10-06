@Test
    public void testCloning() {
        CategoryPlot p1 = new CategoryPlot();
        p1.setRangeCrosshairPaint(new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.YELLOW));
        p1.setRangeMinorGridlinePaint(new GradientPaint(2.0f, 3.0f, Color.WHITE,
                4.0f, 5.0f, Color.RED));
        p1.setRangeZeroBaselinePaint(new GradientPaint(3.0f, 4.0f, Color.RED,
                5.0f, 6.0f, Color.WHITE));
        CategoryPlot p2;
        try {
            p2 = (CategoryPlot) p1.clone();
        }
        catch (CloneNotSupportedException e) {
            fail("Cloning failed.");
            return;
        }
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));

        // check independence
        p1.addAnnotation(new CategoryLineAnnotation("C1", 1.0, "C2", 2.0,
                Color.RED, new BasicStroke(1.0f)));
        assertFalse(p1.equals(p2));
        p2.addAnnotation(new CategoryLineAnnotation("C1", 1.0, "C2", 2.0,
                Color.RED, new BasicStroke(1.0f)));
        assertTrue(p1.equals(p2));

        p1.addDomainMarker(new CategoryMarker("C1"), Layer.FOREGROUND);
        assertFalse(p1.equals(p2));
        p2.addDomainMarker(new CategoryMarker("C1"), Layer.FOREGROUND);
        assertTrue(p1.equals(p2));

        p1.addDomainMarker(new CategoryMarker("C2"), Layer.BACKGROUND);
        assertFalse(p1.equals(p2));
        p2.addDomainMarker(new CategoryMarker("C2"), Layer.BACKGROUND);
        assertTrue(p1.equals(p2));

        p1.addRangeMarker(new ValueMarker(1.0), Layer.FOREGROUND);
        assertFalse(p1.equals(p2));
        p2.addRangeMarker(new ValueMarker(1.0), Layer.FOREGROUND);
        assertTrue(p1.equals(p2));

        p1.addRangeMarker(new ValueMarker(2.0), Layer.BACKGROUND);
        assertFalse(p1.equals(p2));
        p2.addRangeMarker(new ValueMarker(2.0), Layer.BACKGROUND);
        assertTrue(p1.equals(p2));
    }

    