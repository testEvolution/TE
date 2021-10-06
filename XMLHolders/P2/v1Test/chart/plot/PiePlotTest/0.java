@Test
    public void testEquals() {

        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        assertTrue(plot1.equals(plot2));
        assertTrue(plot2.equals(plot1));

        // pieIndex...
        plot1.setPieIndex(99);
        assertFalse(plot1.equals(plot2));
        plot2.setPieIndex(99);
        assertTrue(plot1.equals(plot2));

        // interiorGap...
        plot1.setInteriorGap(0.15);
        assertFalse(plot1.equals(plot2));
        plot2.setInteriorGap(0.15);
        assertTrue(plot1.equals(plot2));

        // circular
        plot1.setCircular(!plot1.isCircular());
        assertFalse(plot1.equals(plot2));
        plot2.setCircular(false);
        assertTrue(plot1.equals(plot2));

        // startAngle
        plot1.setStartAngle(Math.PI);
        assertFalse(plot1.equals(plot2));
        plot2.setStartAngle(Math.PI);
        assertTrue(plot1.equals(plot2));

        // direction
        plot1.setDirection(Rotation.ANTICLOCKWISE);
        assertFalse(plot1.equals(plot2));
        plot2.setDirection(Rotation.ANTICLOCKWISE);
        assertTrue(plot1.equals(plot2));

        // ignoreZeroValues
        plot1.setIgnoreZeroValues(true);
        plot2.setIgnoreZeroValues(false);
        assertFalse(plot1.equals(plot2));
        plot2.setIgnoreZeroValues(true);
        assertTrue(plot1.equals(plot2));

        // ignoreNullValues
        plot1.setIgnoreNullValues(true);
        plot2.setIgnoreNullValues(false);
        assertFalse(plot1.equals(plot2));
        plot2.setIgnoreNullValues(true);
        assertTrue(plot1.equals(plot2));


        // sectionPaintMap
        plot1.setSectionPaint("A", new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.WHITE));
        assertFalse(plot1.equals(plot2));
        plot2.setSectionPaint("A", new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.WHITE));
        assertTrue(plot1.equals(plot2));

        // defaultSectionPaint
        plot1.setDefaultSectionPaint(new GradientPaint(1.0f, 2.0f, Color.BLACK,
                3.0f, 4.0f, Color.WHITE));
        assertFalse(plot1.equals(plot2));
        plot2.setDefaultSectionPaint(new GradientPaint(1.0f, 2.0f, Color.BLACK,
                3.0f, 4.0f, Color.WHITE));
        assertTrue(plot1.equals(plot2));

        // sectionOutlinesVisible
        plot1.setSectionOutlinesVisible(false);
        assertFalse(plot1.equals(plot2));
        plot2.setSectionOutlinesVisible(false);
        assertTrue(plot1.equals(plot2));

        // sectionOutlinePaintList
        plot1.setSectionOutlinePaint("A", new GradientPaint(1.0f, 2.0f,
                Color.GREEN, 3.0f, 4.0f, Color.WHITE));
        assertFalse(plot1.equals(plot2));
        plot2.setSectionOutlinePaint("A", new GradientPaint(1.0f, 2.0f,
                Color.GREEN, 3.0f, 4.0f, Color.WHITE));
        assertTrue(plot1.equals(plot2));

        // defaultSectionOutlinePaint
        plot1.setDefaultSectionOutlinePaint(new GradientPaint(1.0f, 2.0f,
                Color.GRAY, 3.0f, 4.0f, Color.WHITE));
        assertFalse(plot1.equals(plot2));
        plot2.setDefaultSectionOutlinePaint(new GradientPaint(1.0f, 2.0f,
                Color.GRAY, 3.0f, 4.0f, Color.WHITE));
        assertTrue(plot1.equals(plot2));

        // sectionOutlineStrokeList
        plot1.setSectionOutlineStroke("A", new BasicStroke(1.0f));
        assertFalse(plot1.equals(plot2));
        plot2.setSectionOutlineStroke("A", new BasicStroke(1.0f));
        assertTrue(plot1.equals(plot2));

        // defaultSectionOutlineStroke
        plot1.setDefaultSectionOutlineStroke(new BasicStroke(1.0f));
        assertFalse(plot1.equals(plot2));
        plot2.setDefaultSectionOutlineStroke(new BasicStroke(1.0f));
        assertTrue(plot1.equals(plot2));

        // shadowPaint
        plot1.setShadowPaint(new GradientPaint(1.0f, 2.0f, Color.ORANGE,
                3.0f, 4.0f, Color.WHITE));
        assertFalse(plot1.equals(plot2));
        plot2.setShadowPaint(new GradientPaint(1.0f, 2.0f, Color.ORANGE,
                3.0f, 4.0f, Color.WHITE));
        assertTrue(plot1.equals(plot2));

        // shadowXOffset
        plot1.setShadowXOffset(4.4);
        assertFalse(plot1.equals(plot2));
        plot2.setShadowXOffset(4.4);
        assertTrue(plot1.equals(plot2));

        // shadowYOffset
        plot1.setShadowYOffset(4.4);
        assertFalse(plot1.equals(plot2));
        plot2.setShadowYOffset(4.4);
        assertTrue(plot1.equals(plot2));

        // labelFont
        plot1.setLabelFont(new Font("Serif", Font.PLAIN, 18));
        assertFalse(plot1.equals(plot2));
        plot2.setLabelFont(new Font("Serif", Font.PLAIN, 18));
        assertTrue(plot1.equals(plot2));

        // labelPaint
        plot1.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.DARK_GRAY,
                3.0f, 4.0f, Color.WHITE));
        assertFalse(plot1.equals(plot2));
        plot2.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.DARK_GRAY,
                3.0f, 4.0f, Color.WHITE));
        assertTrue(plot1.equals(plot2));

        // labelBackgroundPaint
        plot1.setLabelBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.WHITE));
        assertFalse(plot1.equals(plot2));
        plot2.setLabelBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.WHITE));
        assertTrue(plot1.equals(plot2));

        // labelOutlinePaint
        plot1.setLabelOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.WHITE));
        assertFalse(plot1.equals(plot2));
        plot2.setLabelOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.WHITE));
        assertTrue(plot1.equals(plot2));

        // labelOutlineStroke
        Stroke s = new BasicStroke(1.1f);
        plot1.setLabelOutlineStroke(s);
        assertFalse(plot1.equals(plot2));
        plot2.setLabelOutlineStroke(s);
        assertTrue(plot1.equals(plot2));

        // labelShadowPaint
        plot1.setLabelShadowPaint(new GradientPaint(1.0f, 2.0f, Color.YELLOW,
                3.0f, 4.0f, Color.WHITE));
        assertFalse(plot1.equals(plot2));
        plot2.setLabelShadowPaint(new GradientPaint(1.0f, 2.0f, Color.YELLOW,
                3.0f, 4.0f, Color.WHITE));
        assertTrue(plot1.equals(plot2));

        // explodePercentages
        plot1.setExplodePercent("A", 0.33);
        assertFalse(plot1.equals(plot2));
        plot2.setExplodePercent("A", 0.33);
        assertTrue(plot1.equals(plot2));

        // labelGenerator
        plot1.setLabelGenerator(new StandardPieSectionLabelGenerator(
                "{2}{1}{0}"));
        assertFalse(plot1.equals(plot2));
        plot2.setLabelGenerator(new StandardPieSectionLabelGenerator(
                "{2}{1}{0}"));
        assertTrue(plot1.equals(plot2));

        // labelFont
        Font f = new Font("SansSerif", Font.PLAIN, 20);
        plot1.setLabelFont(f);
        assertFalse(plot1.equals(plot2));
        plot2.setLabelFont(f);
        assertTrue(plot1.equals(plot2));

        // labelPaint
        plot1.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.MAGENTA,
                3.0f, 4.0f, Color.WHITE));
        assertFalse(plot1.equals(plot2));
        plot2.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.MAGENTA,
                3.0f, 4.0f, Color.WHITE));
        assertTrue(plot1.equals(plot2));

        // maximumLabelWidth
        plot1.setMaximumLabelWidth(0.33);
        assertFalse(plot1.equals(plot2));
        plot2.setMaximumLabelWidth(0.33);
        assertTrue(plot1.equals(plot2));

        // labelGap
        plot1.setLabelGap(0.11);
        assertFalse(plot1.equals(plot2));
        plot2.setLabelGap(0.11);
        assertTrue(plot1.equals(plot2));

        // links visible
        plot1.setLabelLinksVisible(false);
        assertFalse(plot1.equals(plot2));
        plot2.setLabelLinksVisible(false);
        assertTrue(plot1.equals(plot2));

        plot1.setLabelLinkStyle(PieLabelLinkStyle.QUAD_CURVE);
        assertFalse(plot1.equals(plot2));
        plot2.setLabelLinkStyle(PieLabelLinkStyle.QUAD_CURVE);
        assertTrue(plot1.equals(plot2));

        // linkMargin
        plot1.setLabelLinkMargin(0.11);
        assertFalse(plot1.equals(plot2));
        plot2.setLabelLinkMargin(0.11);
        assertTrue(plot1.equals(plot2));

        // labelLinkPaint
        plot1.setLabelLinkPaint(new GradientPaint(1.0f, 2.0f, Color.MAGENTA,
                3.0f, 4.0f, Color.WHITE));
        assertFalse(plot1.equals(plot2));
        plot2.setLabelLinkPaint(new GradientPaint(1.0f, 2.0f, Color.MAGENTA,
                3.0f, 4.0f, Color.WHITE));
        assertTrue(plot1.equals(plot2));

        // labelLinkStroke
        plot1.setLabelLinkStroke(new BasicStroke(1.0f));
        assertFalse(plot1.equals(plot2));
        plot2.setLabelLinkStroke(new BasicStroke(1.0f));
        assertTrue(plot1.equals(plot2));

        // toolTipGenerator
        plot1.setToolTipGenerator(
            new StandardPieToolTipGenerator("{2}{1}{0}")
        );
        assertFalse(plot1.equals(plot2));
        plot2.setToolTipGenerator(
            new StandardPieToolTipGenerator("{2}{1}{0}")
        );
        assertTrue(plot1.equals(plot2));

        // urlGenerator
        plot1.setURLGenerator(new StandardPieURLGenerator("xx"));
        assertFalse(plot1.equals(plot2));
        plot2.setURLGenerator(new StandardPieURLGenerator("xx"));
        assertTrue(plot1.equals(plot2));

        // minimumArcAngleToDraw
        plot1.setMinimumArcAngleToDraw(1.0);
        assertFalse(plot1.equals(plot2));
        plot2.setMinimumArcAngleToDraw(1.0);
        assertTrue(plot1.equals(plot2));

        // legendItemShape
        plot1.setLegendItemShape(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        assertFalse(plot1.equals(plot2));
        plot2.setLegendItemShape(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        assertTrue(plot1.equals(plot2));

        // legendLabelGenerator
        plot1.setLegendLabelGenerator(new StandardPieSectionLabelGenerator(
                "{0} --> {1}"));
        assertFalse(plot1.equals(plot2));
        plot2.setLegendLabelGenerator(new StandardPieSectionLabelGenerator(
                "{0} --> {1}"));
        assertTrue(plot1.equals(plot2));

        // legendLabelToolTipGenerator
        plot1.setLegendLabelToolTipGenerator(
                new StandardPieSectionLabelGenerator("{0} is {1}"));
        assertFalse(plot1.equals(plot2));
        plot2.setLegendLabelToolTipGenerator(
                new StandardPieSectionLabelGenerator("{0} is {1}"));
        assertTrue(plot1.equals(plot2));

        // legendLabelURLGenerator
        plot1.setLegendLabelURLGenerator(new StandardPieURLGenerator(
                "index.html"));
        assertFalse(plot1.equals(plot2));
        plot2.setLegendLabelURLGenerator(new StandardPieURLGenerator(
                "index.html"));
        assertTrue(plot1.equals(plot2));

        // autoPopulateSectionPaint
        plot1.setAutoPopulateSectionPaint(false);
        assertFalse(plot1.equals(plot2));
        plot2.setAutoPopulateSectionPaint(false);
        assertTrue(plot1.equals(plot2));

        // autoPopulateSectionOutlinePaint
        plot1.setAutoPopulateSectionOutlinePaint(true);
        assertFalse(plot1.equals(plot2));
        plot2.setAutoPopulateSectionOutlinePaint(true);
        assertTrue(plot1.equals(plot2));

        // autoPopulateSectionOutlineStroke
        plot1.setAutoPopulateSectionOutlineStroke(true);
        assertFalse(plot1.equals(plot2));
        plot2.setAutoPopulateSectionOutlineStroke(true);
        assertTrue(plot1.equals(plot2));

        // shadowGenerator
        plot1.setShadowGenerator(new DefaultShadowGenerator(5, Color.GRAY,
                0.6f, 4, -Math.PI / 4));
        assertFalse(plot1.equals(plot2));
        plot2.setShadowGenerator(new DefaultShadowGenerator(5, Color.GRAY,
                0.6f, 4, -Math.PI / 4));
        assertTrue(plot1.equals(plot2));

        plot1.setShadowGenerator(null);
        assertFalse(plot1.equals(plot2));
        plot2.setShadowGenerator(null);
        assertTrue(plot1.equals(plot2));
    }

    