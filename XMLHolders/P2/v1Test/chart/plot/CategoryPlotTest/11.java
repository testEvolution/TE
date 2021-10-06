@Test
    public void testBug2817504() {
        CategoryPlot p1 = new CategoryPlot();
        LineAndShapeRenderer r1 = new LineAndShapeRenderer();
        p1.setRenderer(r1);
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

        // check for independence
        LineAndShapeRenderer r2 = (LineAndShapeRenderer) p2.getRenderer();
        assertTrue(r2.getPlot() == p2);
    }

    