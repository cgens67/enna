use strict;
use warnings;

my $file = 'app/src/main/kotlin/com/enna/music/lite/ui/screens/settings/AboutScreen.kt';
open my $fh, '<', $file or die;
my $content = do { local $/; <$fh> };
close $fh;

$content =~ s/val leadDeveloper = TeamMember\([\s\S]*?val collaborators = listOf\([\s\S]*?    \)/val leadDeveloper = TeamMember(
        avatarUrl = "https:\/\/github.com\/cgens67.png",
        name = "cgens67",
        position = "Developer",
        profileUrl = "https:\/\/github.com\/cgens67",
        github = "https:\/\/github.com\/cgens67",
        website = null,
        discord = null
    )

    val collaborators = emptyList<TeamMember>()/gs;

open my $out, '>', $file or die;
print $out $content;
close $out;
